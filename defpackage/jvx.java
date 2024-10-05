package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jvx implements fjn, fjp {
    public final Context a;
    public final aild b;
    public final agyr c;
    public final agzj d;
    public final jws e;
    public final acqz f;
    public final jsj g;
    public final azrw h;
    public final Executor i;

    public jvx(Context context, aild aildVar, agyr agyrVar, agzj agzjVar, jws jwsVar, acqz acqzVar, jsj jsjVar, azrw azrwVar, Executor executor) {
        this.a = context;
        this.b = aildVar;
        this.c = agyrVar;
        this.d = agzjVar;
        this.e = jwsVar;
        this.f = acqzVar;
        this.g = jsjVar;
        this.h = azrwVar;
        this.i = executor;
    }

    @Override // defpackage.fjn
    public final void a(final String str, final agnv agnvVar, final String str2) {
        if (agnvVar == null) {
            if (!ammx.e(str2)) {
                this.c.i(str2, str);
                return;
            } else {
                this.d.m(str2, str, null, true);
                return;
            }
        }
        ynm.k(((agpr) this.h.get()).a(agnvVar), this.i, jun.e, new ynl() { // from class: jvu
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                final jvx jvxVar = jvx.this;
                final String str3 = str;
                final agnv agnvVar2 = agnvVar;
                final String str4 = str2;
                final agnq agnqVar = (agnq) obj;
                if (agnqVar == agnq.PLAYABLE) {
                    return;
                }
                amkq.E(agnqVar != agnq.PLAYABLE);
                ynm.k(((agpr) jvxVar.h.get()).b(agnvVar2), jvxVar.i, jun.d, new ynl() { // from class: jvv
                    @Override // defpackage.ynl, defpackage.zfi
                    public final void a(Object obj2) {
                        Object d;
                        jvx jvxVar2 = jvx.this;
                        String str5 = str3;
                        agnv agnvVar3 = agnvVar2;
                        String str6 = str4;
                        agnq agnqVar2 = agnqVar;
                        if (((Boolean) obj2).booleanValue()) {
                            if (agnqVar2 != agnq.TRANSFER_PENDING_USER_APPROVAL || ammx.e(str6)) {
                                if (agnqVar2 == agnq.ERROR_PENDING_PLAYABILITY_ACTION) {
                                    jvxVar2.b.k(agnvVar3.k, new jvw(jvxVar2, str5, str6), str5);
                                    return;
                                }
                                if (agnqVar2 == agnq.ERROR_STREAMS_MISSING) {
                                    jvxVar2.d.t(str6, str5);
                                    return;
                                }
                                if (agnqVar2 == agnq.ERROR_EXPIRED) {
                                    agnu agnuVar = agnvVar3.j;
                                    agzj agzjVar = jvxVar2.d;
                                    agnuVar.getClass();
                                    agzjVar.e(agnuVar, true);
                                    return;
                                }
                                if (agnqVar2 == agnq.ERROR_POLICY || agnqVar2 == agnq.ERROR_NOT_PLAYABLE) {
                                    agnu agnuVar2 = agnvVar3.j;
                                    jsj jsjVar = jvxVar2.g;
                                    if (agnuVar2 != null && jsj.a(agnuVar2.b)) {
                                        jsjVar.a.c(2);
                                    }
                                    if (agnuVar2 == null || (d = agnuVar2.d()) == null) {
                                        return;
                                    }
                                    jvxVar2.d.q(str5, d, jvxVar2.f.mM());
                                    return;
                                }
                                if (agnqVar2 == agnq.ERROR_EXPIRED_RENTAL) {
                                    jvxVar2.d.c(str5, true);
                                    return;
                                } else if (jvxVar2.e(agnvVar3)) {
                                    jvxVar2.d.m(str6, str5, null, true);
                                    return;
                                } else {
                                    jvxVar2.d.c(str5, true);
                                    return;
                                }
                            }
                            jvxVar2.c.f(str6, agyg.a(true));
                            return;
                        }
                        if (agnqVar2 == agnq.TRANSFER_PENDING_TOOTHFAIRY) {
                            new AlertDialog.Builder(jvxVar2.a).setTitle(R.string.offline_dialog_waiting_for_discount_title).setMessage(R.string.offline_dialog_waiting_for_discount_or_wifi_message).setCancelable(true).setPositiveButton(R.string.ok, hgs.d).show();
                            return;
                        }
                        if (agnvVar3.D() || agnvVar3.B() || agnvVar3.C()) {
                            jvxVar2.e.d(R.string.offline_click_queued_offline_video_snackbar_text);
                            acrb acrbVar = acrb.OFFLINE_VIDEO_NOT_DOWNLOADED_YET;
                            acra mM = jvxVar2.f.mM();
                            if (mM == null) {
                                zga.b("No valid interaction logger.");
                            } else {
                                mM.n(new acqx(acrbVar));
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.fjp
    public final void b(String str, jmt jmtVar, Optional optional) {
        a(str, (agnv) jmtVar.b(), (String) optional.orElse(null));
    }

    public final boolean e(agnv agnvVar) {
        try {
            return ((Boolean) ((agpr) this.h.get()).c(agnvVar).get(4L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zga.d("Unable to determine if a failed download is retryable.", e);
            if (!(e instanceof InterruptedException)) {
                return false;
            }
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
