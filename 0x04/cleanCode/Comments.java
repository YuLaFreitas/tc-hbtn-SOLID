public class Comments {

    public Owner getTestcaseOwner(Testcase testcase){};


    public Hours getHoursInQuarter(){};


    // TODO Este métod deve ser removido
    public void check(){
        return;
    }


    /**
     * <p> this method publishes results based on date
     * </p>
     * @param date date from when results should be published
     * @return List of Result entities
     * @since 16.0
     */
    public List<Result> publishResults(Date date) {
        // some business logic here
    }
}


- Após a correção, salve a classe no diretório raiz do projeto o arquivo `Comments.java`