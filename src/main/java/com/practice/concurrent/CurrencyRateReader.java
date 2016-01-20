package com.practice.concurrent;

/**
 * Created by sandeep on 13/01/2016.
 */
public class CurrencyRateReader {

/*

    private static final String CURRENCY_PATH = "C:/Forex";
    private static List<String> listOfFiles = new ArrayList<String>();
    private static final String DATE_FORMATER = "yyyy-MM-dd HH:mm:ss";
    private static int count = 0;

    // Reading the data and counting them
    public static void main(String[] args) throws IOException, ParseException{

        File  file = new File(CURRENCY_PATH);

        Map<String , List>  map  = new HashMap<String, List>();

        if(file.exists()){
            String  listOfFolders[] = file.list();

            for(String str : listOfFolders){
                map.put(str, dataForCurrency(str));  // Preparing map eg..  key= "USD_JPY" AND value = list of all records
            }

            for(Map.Entry<String, List> entry : map.entrySet()){

                List<List<CurrencyRate>> listOfExcelss = entry.getValue();
                for(List<CurrencyRate> oneExcel : listOfExcelss){

                    for(CurrencyRate cr : oneExcel){
                        count++;

                    }
                }
            }
            System.out.println(count);
        }*/
}



/*


// Model class holding all fields
class CurrencyRate {

    private String forexName;
    private Date date;
    private String quoteBid;
    private String quoteAsk;

    public String getForexName() {
        return forexName;
    }
    public void setForexName(String forexName) {
        this.forexName = forexName;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getQuoteBid() {
        return quoteBid;
    }
    public void setQuoteBid(String quoteBid) {
        this.quoteBid = quoteBid;
    }
    public String getQuoteAsk() {
        return quoteAsk;
    }
    public void setQuoteAsk(String quoteAsk) {
        this.quoteAsk = quoteAsk;
    }


}
public class CurrencyRateController {

    }

    // list of list holding data of excels
    private static List dataForCurrency(String str) throws IOException, ParseException {
        List<List<CurrencyRate>> listOfExcels = new LinkedList<List<CurrencyRate>>();
        String folderFiles = CURRENCY_PATH+"/"+str;
        String line = "";
        File file = new File(folderFiles);
        SimpleDateFormat formater = new SimpleDateFormat(DATE_FORMATER);
        if(file.exists())
            listOfFiles = Arrays.asList(file.list());

        for(String str2 : listOfFiles){

            BufferedReader br = new BufferedReader(new FileReader(folderFiles+"/"+str2));
            List<CurrencyRate> listOfObjects = new LinkedList<CurrencyRate>();
            while((line = br.readLine()) != null){
                String[] data = line.split(",");
                CurrencyRate obj = new CurrencyRate();
                obj.setForexName(data[1]);
                obj.setDate(formater.parse(data[2].substring(0 , data[2].lastIndexOf("."))));
                obj.setQuoteBid(data[3]);
                obj.setQuoteAsk(data[4]);
                listOfObjects.add(obj);       // List holding all records of 1 excel is prepared here.
            }
            listOfExcels.add(listOfObjects);   // List holding lists of all excels
        }

        return listOfExcels;
    }
}*/