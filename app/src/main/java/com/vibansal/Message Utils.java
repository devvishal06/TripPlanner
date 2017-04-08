Intent intent = getIntent();
    Bundle bundle = intent.getBundleExtra("mySMS");

    if (bundle != null) {
        Object[] pdus = (Object[])bundle.get("pdus");
        SmsMessage sms = SmsMessage.createFromPdu((byte[])pdus[0]);
        Log.i("mobile.cs.fsu.edu", "smsActivity : SMS is <" +  sms.getMessageBody() +">");

        //strip flag
        String message = sms.getMessageBody();
        while (message.contains("FLAG"))
            message = message.replace("FLAG", "");

        TextView tx = (TextView) findViewById(R.id.TextBox);
        tx.setText(message);            
    } else
        Log.i("mobile.cs.fsu.edu", "smsActivity : NULL SMS bundle");