package defpackage;

import android.R;
import android.accounts.Account;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog$CustomWebView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikz implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {
    final /* synthetic */ aila a;
    private final aiky b;
    private final atyt c;
    private final ailc d;

    public aikz(aila ailaVar, ailc ailcVar, aiky aikyVar, atyt atytVar) {
        this.a = ailaVar;
        this.d = ailcVar;
        this.c = atytVar;
        this.b = aikyVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.d.b();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        atyt atytVar = this.c;
        if (i == -2) {
            this.d.b();
            this.a.f = null;
            return;
        }
        if (i != -1) {
            return;
        }
        aiky aikyVar = this.b;
        if (aikyVar == null || atytVar == null) {
            this.d.a();
        } else {
            ailc ailcVar = this.d;
            final aikx aikxVar = (aikx) aikyVar;
            amkq.N(aikxVar.c.t());
            aikxVar.h = ailcVar;
            Activity activity = (Activity) aikxVar.a.get();
            if (activity == null || activity.isFinishing()) {
                afsi.b(1, 10, "Attempted to start AgeVerificationDialog when the activity is destroyed");
            } else {
                aikxVar.d = new Dialog(activity, R.style.Theme.Black.NoTitleBar.Fullscreen);
            }
            aikxVar.d.setContentView(com.google.android.youtube.R.layout.age_verification_dialog);
            aikxVar.d.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: aiks
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface2) {
                    aikx.this.b();
                }
            });
            View findViewById = aikxVar.d.findViewById(com.google.android.youtube.R.id.close);
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: aikt
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    aikx.this.b();
                }
            });
            aikxVar.e = (AgeVerificationDialog$CustomWebView) aikxVar.d.findViewById(com.google.android.youtube.R.id.webview);
            aikxVar.e.getSettings().setJavaScriptEnabled(true);
            aikxVar.e.setVisibility(0);
            aikxVar.e.getSettings().setSaveFormData(false);
            Account b = aikxVar.g.b(aikxVar.c.c());
            final String str = atytVar.c;
            final String str2 = b == null ? "" : b.name;
            aikxVar.e.setWebViewClient(new aikv(aikxVar, str));
            aikxVar.f = ykn.c(new aikw(aikxVar));
            final Activity activity2 = (Activity) aikxVar.a.get();
            if (activity2 == null || activity2.isFinishing()) {
                afsi.b(1, 10, "Attempted to loadVideoView for AgeVerificationDialog when the activity is destroyed");
            } else {
                aikxVar.b.execute(new Runnable() { // from class: aiku
                    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
                    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void run() {
                        /*
                            r6 = this;
                            aikx r0 = defpackage.aikx.this
                            java.lang.String r1 = r2
                            java.lang.String r2 = r3
                            android.app.Activity r3 = r4
                            ykn r4 = r0.f
                            yki r3 = defpackage.yki.c(r3, r4)
                            java.lang.String r1 = android.net.Uri.encode(r1)
                            java.lang.String r1 = java.lang.String.valueOf(r1)
                            int r4 = r1.length()
                            java.lang.String r5 = "weblogin:continue="
                            if (r4 == 0) goto L23
                            java.lang.String r1 = r5.concat(r1)
                            goto L28
                        L23:
                            java.lang.String r1 = new java.lang.String
                            r1.<init>(r5)
                        L28:
                            r4 = 0
                            java.lang.ref.WeakReference r0 = r0.a     // Catch: java.lang.Exception -> L38
                            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L38
                            android.app.Activity r0 = (android.app.Activity) r0     // Catch: java.lang.Exception -> L38
                            if (r0 == 0) goto L3c
                            java.lang.String r0 = defpackage.qde.l(r0, r2, r1)     // Catch: java.lang.Exception -> L38
                            goto L3d
                        L38:
                            r0 = move-exception
                            r3.a(r4, r0)
                        L3c:
                            r0 = r4
                        L3d:
                            if (r0 != 0) goto L48
                            java.lang.Exception r0 = new java.lang.Exception
                            r0.<init>()
                            r3.a(r4, r0)
                            return
                        L48:
                            r3.b(r4, r0)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiku.run():void");
                    }
                });
            }
        }
        this.a.f = null;
    }
}
