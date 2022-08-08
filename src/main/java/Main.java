public class Main {
    public static void main(String[] args) {
        Post questionnaire = new Post();
        FormDate birthday = new FormDate();
        questionnaire.name = "Dmitriy";
        questionnaire.surname = "Mishinev";
        questionnaire.patronymic = "Alexeyvich";
        questionnaire.passport = "5698 №268974";
        questionnaire.phone = "+79123658974";
        questionnaire.subscription = true;
        birthday.day = 23;
        birthday.month = 07;
        birthday.year = 1989;
    }
}
