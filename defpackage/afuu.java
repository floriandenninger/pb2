package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afuu implements afvq {
    public final afri a;
    public final Executor b;
    private final afvq c;
    private final afrh d;

    /* JADX INFO: Access modifiers changed from: protected */
    public afuu(afrh afrhVar, afri afriVar) {
        this.c = null;
        this.d = afrhVar;
        this.a = afriVar;
        this.b = null;
    }

    public afuu(afvq afvqVar, afri afriVar, Executor executor) {
        this.c = afvqVar;
        this.d = null;
        this.a = afriVar;
        this.b = executor;
    }

    protected void a(Object obj, ykl yklVar) {
        afvq afvqVar = this.c;
        afvqVar.getClass();
        afvqVar.c(obj, yklVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b(Object obj, Object obj2, ykl yklVar, Exception exc) {
        yklVar.a(obj, exc);
    }

    @Override // defpackage.afvq
    public final void c(Object obj, ykl yklVar) {
        try {
            afrh afrhVar = this.d;
            Object c = afrhVar != null ? afrhVar.c(obj) : obj;
            a(c, new afut(this, obj, c, yklVar));
        } catch (zjg e) {
            b(obj, null, yklVar, e);
        }
    }
}
