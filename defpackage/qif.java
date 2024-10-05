package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qif extends BroadcastReceiver {
    final /* synthetic */ qij a;

    public qif(qij qijVar) {
        this.a = qijVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        PendingIntent activities;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        qip.an(componentName);
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        qft qftVar = this.a.d;
        qip.as("Must be called from the main thread.");
        if (qftVar.e.g()) {
            intent2.setFlags(603979776);
            activities = rai.a(context, 1, intent2, rai.a | 134217728);
            try {
                qip.an(activities);
                activities.send(context, 1, new Intent().setFlags(268435456));
                return;
            } catch (PendingIntent.CanceledException unused) {
                return;
            }
        }
        et a = et.a(this.a);
        a.c(componentName);
        a.b(intent2);
        int i = rai.a | 134217728;
        if (!a.a.isEmpty()) {
            ArrayList arrayList = a.a;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            activities = PendingIntent.getActivities(a.b, 1, intentArr, i, null);
            qip.an(activities);
            activities.send(context, 1, new Intent().setFlags(268435456));
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }
}
