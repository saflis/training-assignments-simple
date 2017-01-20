package eu.sig.training.ch05.buildandsendmail;

public class BuildAndSendMail {
    // tag::buildAndSendMail[]
    public void buildAndSendMail(MailMan m, MailInfo mailInfo) {
        // Format the email address
        String mId = mailInfo.getFirstName.charAt(0) + "." + mailInfo.getLastName.substring(0, 7) + "@"
            + mailInfo.getDivision.substring(0, 5) + ".compa.ny";
        // Format the message given the content type and raw message
        MailMessage mMessage = formatMessage(mailInfo.getFont,
            mailInfo.getMessage1 + mailInfo.getMessage2 + mailInfo.getMessage3);
        // Send message
        m.send(mId, mailInfo.getSubject, mMessage);
    }
    // end::buildAndSendMail[]

    @SuppressWarnings("unused")
    private MailMessage formatMessage(MailFont font, String string) {
        return null;
    }

    private class MailMan {

        @SuppressWarnings("unused")
        public void send(String mId, String subject, MailMessage mMessage) {}

    }

    private class MailFont {

    }

    private class MailMessage {

    }

}