package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessagingMessengerCompat;
import java.util.regex.Matcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qmr extends amcc {
    final /* synthetic */ qms a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qmr(qms qmsVar, Looper looper) {
        super(looper, (byte[]) null);
        this.a = qmsVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        qms qmsVar = this.a;
        if (message == null || !(message.obj instanceof Intent)) {
            Log.w("Rpc", "Dropping invalid message");
            return;
        }
        Intent intent = (Intent) message.obj;
        intent.setExtrasClassLoader(new qly());
        if (intent.hasExtra("google.messenger")) {
            Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
            if (parcelableExtra instanceof CloudMessagingMessengerCompat) {
                qmsVar.e = (CloudMessagingMessengerCompat) parcelableExtra;
            }
            if (parcelableExtra instanceof Messenger) {
                qmsVar.d = (Messenger) parcelableExtra;
            }
        }
        Intent intent2 = (Intent) message.obj;
        if ("com.google.android.c2dm.intent.REGISTRATION".equals(intent2.getAction())) {
            String stringExtra = intent2.getStringExtra("registration_id");
            if (stringExtra == null) {
                stringExtra = intent2.getStringExtra("unregistered");
            }
            if (stringExtra == null) {
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf = String.valueOf(intent2.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf);
                    Log.w("Rpc", sb.toString());
                    return;
                }
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !"ID".equals(split[1])) {
                        Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                        return;
                    }
                    String str = split[2];
                    String str2 = split[3];
                    if (str2.startsWith(":")) {
                        str2 = str2.substring(1);
                    }
                    qmsVar.c(str, intent2.putExtra("error", str2).getExtras());
                    return;
                }
                synchronized (qmsVar.c) {
                    int i = 0;
                    while (true) {
                        aeg aegVar = qmsVar.c;
                        if (i < aegVar.j) {
                            qmsVar.c((String) aegVar.f(i), intent2.getExtras());
                            i++;
                        }
                    }
                }
                return;
            }
            Matcher matcher = qms.b.matcher(stringExtra);
            if (matcher.matches()) {
                String group = matcher.group(1);
                String group2 = matcher.group(2);
                if (group != null) {
                    Bundle extras = intent2.getExtras();
                    extras.putString("registration_id", group2);
                    qmsVar.c(group, extras);
                }
            }
        }
    }
}
