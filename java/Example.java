class Example {

    public static void main(String[] args) throws Exception {
        String login = System.getenv("REMOTE_LOGIN");
        String password = System.getenv("REMOTE_PASSWORD");
        String host = System.getenv("REMOTE_HOST");

        PleskApiClient client = new PleskApiClient(host);
        client.setCredentials(login, password);

        String request =
            "<packet version='1.6.3.0'>" +
                "<server>" +
                    "<get_protos/>" +
                "</server>" +
            "</packet>";

        String response = client.request(request);
        System.out.println(response);
    }

}
