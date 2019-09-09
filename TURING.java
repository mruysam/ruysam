package trabalho;





public class TURING {

    int CONT;
    char FITA[];
    
    public void Iniciar(String SENTENCA){
        CONT = 0;
        FITA = SENTENCA.toCharArray();
        q0();
    }
        public void q0(){
            if (CONT < FITA.length){
                if (FITA[CONT]== 'T'){
                    FITA[CONT] = 'T';
                    CONT ++;
                    q4();
                }
                }
        
                else if (FITA[CONT]== 'B'){
                   
                    FITA[CONT] = 'T';
                    CONT ++;
                    q3();
                }
                else if (FITA[CONT]== 'a'){
                   
                    FITA[CONT] = 'A';
                    CONT ++;
                    q1();
                }
                else {
                    qErro();
                }
        }
            
        
        public void q1(){
            if (CONT < FITA.length){
                if (FITA[CONT]== 'a'){
                    FITA[CONT] = 'a';
                    CONT ++;
                    q1();
                }
            }
        
                else if (FITA[CONT]== 'B'){
                   
                    FITA[CONT] = 'B';
                    CONT ++;
                    q1();
                }
                else if (FITA[CONT]== 'b'){
                   
                    FITA[CONT] = 'B';
                    CONT --;
                    q2();
                }
                else {
                    qErro();
                
                }
            
        }
                
            
        
        public void q2(){
            if (CONT < FITA.length){
                if (FITA[CONT]== 'a'){
                    FITA[CONT] = 'a';
                    CONT --;
                    q2();
                }
            }
        
                else if (FITA[CONT]== 'B'){
                   
                    FITA[CONT] = 'B';
                    CONT --;
                    q2();
                }
                else if (FITA[CONT]== 'A'){
                   
                    FITA[CONT] = 'A';
                    CONT ++;
                    q0();
                }
                else {
                    qErro();
                }
        }
                
            
            
        
        public void q3(){
            if (CONT < FITA.length){
                if (FITA[CONT]== 'B'){
                    FITA[CONT] = 'B';
                    CONT ++;
                    q3();
                }
            }
        
                else if (FITA[CONT]== 'T'){
                   
                    FITA[CONT] = 'T';
                    CONT ++;
                    q4();
                }
                else {
                    qErro();
                }
        }
                
            
            
        
        public void q4(){
            String PALAVRA = "";    
            for (int i = 0;i < FITA.length; i++){
                PALAVRA = PALAVRA + FITA[i];
            }
        System.err.println("PALAVRA ACEITA !" + PALAVRA);
            
          
                
            }
        
        public void qErro(){
            String PALAVRA = "";    
            for (int i = 0;i < FITA.length; i++){
                PALAVRA = PALAVRA + FITA[i];
            }   
            System.err.println("PALAVRA NAO ACEITA !" + PALAVRA);
        }
}
