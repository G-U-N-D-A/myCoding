public class HammingDistance {
    public String getBinaryString(int arg){
        if(arg == 0) return "";
        int curBit = arg % 2;
        int nextArg = arg / 2;
        return getBinaryString(nextArg) + ((curBit != 0) ? "1": "0");
    }

    public int countOnes(String binStr){
        int count = 0;
        for(int i = 0; i < binStr.length(); i++){
            if(binStr.charAt(i) == '1'){
                count++;
            }
        }
        return count;
    }

    public int hammingDistance(int x, int y) {
        int xorResult = x^y;
        String binRep = getBinaryString(xorResult );
        return countOnes(binRep);
    }
}
