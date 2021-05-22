// Link of the problem : https://edabit.com/challenge/W7juRdtzze5ZbrfbJ

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class StripURLQueryParameters {
    public static String stripUrlParams(String url, String[] paramsToStrip) {
        if(!url.contains("?")){
            return url;
        }
        String BASE_URL = url.substring(0, url.indexOf("?"));
        String queryParams = url.substring(url.indexOf("?") + 1);
        HashMap<String, String> params = extractQueryParams(queryParams);
        if(paramsToStrip != null){
            removeParams(params, paramsToStrip);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(BASE_URL).append('?');
        for(HashMap.Entry<String, String> param : params.entrySet()){
            stringBuilder.append(param.getKey()).append('=').append(param.getValue()).append('&');
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.toString();
    }

    private static void removeParams(HashMap<String, String> params, String[] paramsToStrip) {
        for(String paramToStrip : paramsToStrip){
            params.remove(paramToStrip);
        }
    }

    private static HashMap<String, String> extractQueryParams(String url) {
        HashMap<String, String> paramsMap = new HashMap<>();
        String[] params = url.split("&");
        Collections.reverse(Arrays.asList(params));
        for(String param : params){
            paramsMap.putIfAbsent(param.substring(0, param.indexOf("=")), param.substring(param.indexOf("=") + 1));
        }
        return paramsMap;
    }
}
