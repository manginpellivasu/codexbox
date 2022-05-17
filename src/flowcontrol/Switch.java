package flowcontrol;

public class Switch {
    public void tiffin(){  int item= 6;
        switch (item) {
            case 1:
                System.out.println("idly");
                break;
            case 2:
                System.out.println("wada");
                break;
            case 3:
                System.out.println("dosa");
                break;
            case 4:
                System.out.println("puri");
                break;
            case 5:
                System.out.println("bonda");
                break;
            default:
                System.out.println("uthappa");
                break;

        }


    }
    public static void main(String[]args) {
        Switch s = new Switch();
        s.tiffin();
        s.month();


        int day = 3;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednusday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            default:
                System.out.println("weekend");
                break;

        }
    }
        public void month(){
     int num= 6;
            switch (num) {
                case 1:
                    System.out.println("jan");
                    break;
                case 2:
                    System.out.println("feb");
                    break;
                case 3:
                    System.out.println("march");
                    break;
                case 4:
                    System.out.println("april");
                    break;
                case 5:
                    System.out.println("may");
                    break;
                case 6:
                    System.out.println("june");
                    break;
                case 7:
                            System.out.println("july");
                            break;
                        case 8:
                            System.out.println("aug");
                            break;
                        case 9:
                            System.out.println("sep");
                            break;
                        case 10:
                            System.out.println("oct");
                            break;
                        case 11:
                            System.out.println("nov");
                            break;
                        default:
                            System.out.println("dec");
                            break;

                    }


                }



        }






