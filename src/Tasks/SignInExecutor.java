package Tasks;

class SignInExecutor {
    public static void main(String[] args) {
        SignIn.getUserNameAndPassword();

        SignIn s = new SignIn();
        s.clickOnSignInWithGoogleButton();
        s.clickOnSignInButton();
    }

    static class SignIn {
        String userName;
        String password;

        static void getUserNameAndPassword() {
            System.out.println("Getting username and password");
        }

        public void clickOnSignInButton() {
            System.out.println("clicking on sign in button");
        }

        public void clickOnSignInWithGoogleButton() {
            System.out.println("Sign in using google credentials");
        }
    }
}


