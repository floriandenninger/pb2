package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class arl extends Handler {
    final /* synthetic */ arm a;
    private final arj b;

    public arl(arm armVar) {
        this.a = armVar;
        this.b = new arj(armVar);
    }

    public final void a(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Bundle data = message.getData();
        switch (message.what) {
            case 1:
                hn.c(data.getBundle("data_root_hints"));
                arj arjVar = this.b;
                String string = data.getString("data_package_name");
                int i = data.getInt("data_calling_pid");
                int i2 = data.getInt("data_calling_uid");
                ark arkVar = new ark(message.replyTo);
                arm armVar = arjVar.a;
                if (string != null) {
                    for (String str : armVar.getPackageManager().getPackagesForUid(i2)) {
                        if (str.equals(string)) {
                            arjVar.a.d.a(new arf(arjVar, arkVar, string, i, i2, 1));
                            return;
                        }
                    }
                }
                throw new IllegalArgumentException("Package/uid mismatch: uid=" + i2 + " package=" + string);
            case 2:
                arj arjVar2 = this.b;
                arjVar2.a.d.a(new arg(arjVar2, new ark(message.replyTo), 1));
                return;
            case 3:
                Bundle bundle = data.getBundle("data_options");
                hn.c(bundle);
                arj arjVar3 = this.b;
                arjVar3.a.d.a(new ard(arjVar3, new ark(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token"), bundle));
                return;
            case 4:
                arj arjVar4 = this.b;
                arjVar4.a.d.a(new are(arjVar4, new ark(message.replyTo), data.getString("data_media_item_id"), data.getBinder("data_callback_token")));
                return;
            case 5:
                arj arjVar5 = this.b;
                String string2 = data.getString("data_media_item_id");
                ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable("data_result_receiver");
                ark arkVar2 = new ark(message.replyTo);
                if (TextUtils.isEmpty(string2) || resultReceiver == null) {
                    return;
                }
                arjVar5.a.d.a(new arh(arjVar5, arkVar2, string2, resultReceiver, 1));
                return;
            case 6:
                hn.c(data.getBundle("data_root_hints"));
                arj arjVar6 = this.b;
                arjVar6.a.d.a(new arf(arjVar6, new ark(message.replyTo), data.getInt("data_calling_uid"), data.getString("data_package_name"), data.getInt("data_calling_pid"), 0));
                return;
            case 7:
                arj arjVar7 = this.b;
                arjVar7.a.d.a(new arg(arjVar7, new ark(message.replyTo), 0));
                return;
            case 8:
                hn.c(data.getBundle("data_search_extras"));
                arj arjVar8 = this.b;
                String string3 = data.getString("data_search_query");
                ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable("data_result_receiver");
                ark arkVar3 = new ark(message.replyTo);
                if (TextUtils.isEmpty(string3) || resultReceiver2 == null) {
                    return;
                }
                arjVar8.a.d.a(new arh(arjVar8, arkVar3, string3, resultReceiver2, 0));
                return;
            case 9:
                Bundle bundle2 = data.getBundle("data_custom_action_extras");
                hn.c(bundle2);
                arj arjVar9 = this.b;
                String string4 = data.getString("data_custom_action");
                ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable("data_result_receiver");
                ark arkVar4 = new ark(message.replyTo);
                if (TextUtils.isEmpty(string4) || resultReceiver3 == null) {
                    return;
                }
                arjVar9.a.d.a(new ari(arjVar9, arkVar4, string4, bundle2, resultReceiver3));
                return;
            default:
                Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                return;
        }
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j) {
        Bundle data = message.getData();
        data.setClassLoader(gl.class.getClassLoader());
        data.putInt("data_calling_uid", Binder.getCallingUid());
        int callingPid = Binder.getCallingPid();
        if (callingPid > 0) {
            data.putInt("data_calling_pid", callingPid);
        } else if (!data.containsKey("data_calling_pid")) {
            data.putInt("data_calling_pid", -1);
        }
        return super.sendMessageAtTime(message, j);
    }
}
