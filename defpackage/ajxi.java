package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ajxi implements ajvd {
    private final aasm a;
    protected final ajti b;
    protected final ajti c;
    protected final acra d;
    protected final ajyw e;
    private final ypa f;
    private final ajvb g;
    private final zaw h;

    public ajxi(aasm aasmVar, ypa ypaVar, ajvb ajvbVar, zaw zawVar, acra acraVar, ajti ajtiVar, ajti ajtiVar2, ajyw ajywVar, byte[] bArr) {
        aasmVar.getClass();
        this.a = aasmVar;
        ypaVar.getClass();
        this.f = ypaVar;
        ajvbVar.getClass();
        this.g = ajvbVar;
        this.d = acraVar;
        zawVar.getClass();
        this.h = zawVar;
        this.b = ajtiVar;
        this.c = ajtiVar2;
        this.e = ajywVar;
    }

    @Override // defpackage.ajvd
    public ajvc a(Object obj, ajxe ajxeVar, ajwx ajwxVar) {
        if (obj instanceof aalz) {
            ajvj ajvjVar = new ajvj(this.a, this.g, this.f, this.h, this.d, ajxeVar);
            if (ajxeVar == null) {
                ajvjVar.i((aalz) obj);
            }
            return ajvjVar;
        }
        if (obj instanceof asjw) {
            return new ajvl(this.a, this.g, this.f, this.h, this.d, (asjw) obj);
        }
        if (obj instanceof aamj) {
            ausu ausuVar = ((aamj) obj).a;
            return new ajxh(this.g, this.f, ausuVar, akbc.i(ausuVar), null, null, ajxeVar);
        }
        if (obj instanceof aaly) {
            ausu ausuVar2 = ((aaly) obj).a;
            return new ajur(this.g, this.f, ausuVar2, akbc.h(ausuVar2), b(ausuVar2), ajxeVar);
        }
        if (!(obj instanceof audc)) {
            return null;
        }
        ajvy ajvyVar = new ajvy(this.a, this.g, this.f, this.h, this.d);
        ajvyVar.l((audc) obj);
        return ajvyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ajuo b(ausu ausuVar) {
        ajyw ajywVar = this.e;
        if (ajywVar == null) {
            return ajxb.a;
        }
        ajti ajtiVar = this.b;
        Activity activity = (Activity) ajywVar.c.get();
        activity.getClass();
        ayqi ayqiVar = (ayqi) ajywVar.b.get();
        ayqiVar.getClass();
        yqw yqwVar = (yqw) ajywVar.a.get();
        yqwVar.getClass();
        ajtiVar.getClass();
        return new ajuk(activity, ayqiVar, yqwVar, ausuVar, ajtiVar);
    }
}
