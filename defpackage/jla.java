package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jla implements agzi, ypd {
    public final Activity a;
    public final jkv b;
    public final acra c;
    public final jws d;
    public final azrw e;
    public atsb f;
    public apmg g;
    public String h = null;
    public final fiu i;
    private final jky j;

    public jla(Activity activity, jkv jkvVar, acra acraVar, jws jwsVar, azrw azrwVar, fiu fiuVar, jky jkyVar) {
        this.a = activity;
        this.b = jkvVar;
        this.c = acraVar;
        this.d = jwsVar;
        this.j = jkyVar;
        this.e = azrwVar;
        this.i = fiuVar;
    }

    @Override // defpackage.agzi
    public final void a(String str, int i) {
        if (str.equals(this.h) && i == 0) {
            jrz jrzVar = ((mvj) this.j).j;
            jrzVar.a();
            jrzVar.b.h();
            OfflineArrowView offlineArrowView = jrzVar.b;
            offlineArrowView.j();
            whu.I(offlineArrowView.e, false);
            whu.I(offlineArrowView.g, true);
            jrzVar.b.setEnabled(false);
            jrzVar.b.setContentDescription(jrzVar.a.getString(R.string.accessibility_offline_button_cancel));
        }
    }

    public final void b(agnv agnvVar) {
        atsb atsbVar = this.f;
        if (atsbVar != null) {
            this.j.a(agnvVar, atsbVar);
        } else {
            this.j.oF(agnvVar);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case -1:
                return new Class[]{jqc.class, jqd.class, agku.class, agky.class, agla.class, aglb.class, agli.class};
            case 0:
                if (!((jqc) obj).a.equals(this.h)) {
                    return null;
                }
                b(null);
                return null;
            case 1:
                String str = ((jqd) obj).a;
                if (!str.equals(this.h)) {
                    return null;
                }
                b(((agof) this.e.get()).a().m().e(str));
                return null;
            case 2:
                agnv agnvVar = ((agku) obj).a;
                if (!agnvVar.m().equals(this.h)) {
                    return null;
                }
                b(agnvVar);
                return null;
            case 3:
                agky agkyVar = (agky) obj;
                if (!agkyVar.a.equals(this.h)) {
                    return null;
                }
                b(null);
                if (agkyVar.b == 0) {
                    whu.K(this.a, R.string.offline_error_no_external_storage, 1);
                    return null;
                }
                whu.K(this.a, R.string.add_video_to_offline_error, 1);
                return null;
            case 4:
                final agnv agnvVar2 = ((agla) obj).a;
                String m = agnvVar2.m();
                if (!m.equals(this.h)) {
                    return null;
                }
                this.i.b().G(new fjx(m, 3)).V(new ayrs(this) { // from class: jkw
                    public final /* synthetic */ jla a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        if (i3 == 0) {
                            jla jlaVar = this.a;
                            agnv agnvVar3 = agnvVar2;
                            if (((Boolean) obj2).booleanValue()) {
                                return;
                            }
                            jlaVar.b(agnvVar3);
                            if (agnvVar3.u()) {
                                agnu agnuVar = agnvVar3.j;
                                atqo atqoVar = null;
                                if (agnuVar != null) {
                                    atqq atqqVar = agnuVar.b;
                                    if (atqqVar.c == 7) {
                                        atqoVar = (atqo) atqqVar.d;
                                    }
                                }
                                if (atqoVar != null) {
                                    jlaVar.b.d(atqoVar, jlaVar.c);
                                    return;
                                }
                                if (agnvVar3.r()) {
                                    whu.K(jlaVar.a, R.string.cannot_watch_offline, 1);
                                    return;
                                }
                                if (!agnvVar3.x()) {
                                    if (agnvVar3.l != agnf.NO_STORAGE_ERROR) {
                                        whu.K(jlaVar.a, R.string.add_video_to_offline_error, 1);
                                        return;
                                    } else {
                                        whu.K(jlaVar.a, R.string.add_to_offline_not_enough_space, 1);
                                        return;
                                    }
                                }
                                if (agnvVar3.j.f()) {
                                    return;
                                }
                                whu.K(jlaVar.a, R.string.cannot_watch_offline, 1);
                                return;
                            }
                            return;
                        }
                        jla jlaVar2 = this.a;
                        agnv agnvVar4 = agnvVar2;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        jlaVar2.b(agnvVar4);
                        jlaVar2.d.d(R.string.add_to_offline_done);
                    }
                });
                return null;
            case 5:
                if (!((aglb) obj).a.equals(this.h)) {
                    return null;
                }
                b(null);
                return null;
            case 6:
                final agnv agnvVar3 = ((agli) obj).a;
                String m2 = agnvVar3.m();
                if (!m2.equals(this.h)) {
                    return null;
                }
                this.i.b().G(new fjx(m2, 4)).V(new ayrs(this) { // from class: jkw
                    public final /* synthetic */ jla a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj2) {
                        if (i2 == 0) {
                            jla jlaVar = this.a;
                            agnv agnvVar32 = agnvVar3;
                            if (((Boolean) obj2).booleanValue()) {
                                return;
                            }
                            jlaVar.b(agnvVar32);
                            if (agnvVar32.u()) {
                                agnu agnuVar = agnvVar32.j;
                                atqo atqoVar = null;
                                if (agnuVar != null) {
                                    atqq atqqVar = agnuVar.b;
                                    if (atqqVar.c == 7) {
                                        atqoVar = (atqo) atqqVar.d;
                                    }
                                }
                                if (atqoVar != null) {
                                    jlaVar.b.d(atqoVar, jlaVar.c);
                                    return;
                                }
                                if (agnvVar32.r()) {
                                    whu.K(jlaVar.a, R.string.cannot_watch_offline, 1);
                                    return;
                                }
                                if (!agnvVar32.x()) {
                                    if (agnvVar32.l != agnf.NO_STORAGE_ERROR) {
                                        whu.K(jlaVar.a, R.string.add_video_to_offline_error, 1);
                                        return;
                                    } else {
                                        whu.K(jlaVar.a, R.string.add_to_offline_not_enough_space, 1);
                                        return;
                                    }
                                }
                                if (agnvVar32.j.f()) {
                                    return;
                                }
                                whu.K(jlaVar.a, R.string.cannot_watch_offline, 1);
                                return;
                            }
                            return;
                        }
                        jla jlaVar2 = this.a;
                        agnv agnvVar4 = agnvVar3;
                        if (((Boolean) obj2).booleanValue()) {
                            return;
                        }
                        jlaVar2.b(agnvVar4);
                        jlaVar2.d.d(R.string.add_to_offline_done);
                    }
                });
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
