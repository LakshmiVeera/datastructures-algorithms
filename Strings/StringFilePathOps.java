package Strings;
/*
    Remove redundancies from the given file path
 */
public class StringFilePathOps {
    public String getNormalizedPath(String path) {
        StringBuffer stringBuffer = new StringBuffer();
        String[] directories = path.split("/");
        for (int i = 0; i < directories.length; i++) {
            if (directories[i].equals("..")) {
                int bufLen = stringBuffer.length();
                if (bufLen > 0) {
                    // if StringBuffer length is greater than 0, then string array prev position had some value
                    int prevStrLen = directories[i-1].length();
                    stringBuffer.delete((bufLen - (prevStrLen+1)), bufLen);
                }
            } else if (directories[i].equals(".")) {
                continue;
            } else {
                stringBuffer.append("/");
                stringBuffer.append(directories[i]);
            }
        }
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        return stringBuffer.toString();
    }
    public static void main(String[] args) {
        StringFilePathOps stringFile = new StringFilePathOps();
        String filePath = "home/laks/../dev/java/./strings";
        System.out.println(stringFile.getNormalizedPath(filePath));
    }
}
