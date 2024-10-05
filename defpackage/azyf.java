package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azyf implements azyn {
    public final azyh a;
    public Object b = azyi.d;

    public azyf(azyh azyhVar) {
        this.a = azyhVar;
    }

    private static final boolean c(Object obj) {
        if (!(obj instanceof azyr)) {
            return true;
        }
        Throwable th = ((azyr) obj).a;
        return false;
    }

    @Override // defpackage.azyn
    public final Object a(azsq azsqVar) {
        azvt azvtVar;
        azvt azvtVar2;
        Object c;
        azxg azxgVar;
        azxg azxgVar2;
        if (this.b != azyi.d) {
            return Boolean.valueOf(c(this.b));
        }
        Object a = this.a.a();
        this.b = a;
        if (a == azyi.d) {
            azsq intercepted = ((azta) azsqVar).intercepted();
            if (!(intercepted instanceof azzm)) {
                azvtVar2 = new azvt(intercepted, 1);
            } else {
                azzm azzmVar = (azzm) intercepted;
                azvm azvmVar = azzmVar.e;
                while (true) {
                    Object obj = azvmVar.a;
                    if (obj != null) {
                        if (obj instanceof azvt) {
                            if (azzmVar.e.c(obj, azzn.b)) {
                                azvtVar = (azvt) obj;
                                break;
                            }
                        } else if (obj != azzn.b && !(obj instanceof Throwable)) {
                            throw new IllegalStateException(azul.a("Inconsistent state ", obj).toString());
                        }
                    } else {
                        azvm azvmVar2 = azzmVar.e;
                        baac baacVar = azzn.b;
                        int i = azvn.a;
                        azvmVar2.a = baacVar;
                        azvtVar = null;
                        break;
                    }
                }
                if (azvtVar == null) {
                    azvtVar2 = null;
                } else {
                    boolean z = azwq.a;
                    Object obj2 = azvtVar.d.a;
                    if (obj2 instanceof azwb) {
                        Object obj3 = ((azwb) obj2).c;
                    }
                    azvk azvkVar = azvtVar.c;
                    int i2 = azvn.a;
                    azvkVar.a = 0;
                    azvtVar.d.a = azvp.a;
                    azvtVar2 = azvtVar;
                }
                if (azvtVar2 == null) {
                    azvtVar2 = new azvt(intercepted, 2);
                }
            }
            azvt azvtVar3 = azvtVar2;
            azyo azyoVar = new azyo(this, azvtVar3);
            while (true) {
                if (!this.a.c(azyoVar)) {
                    Object a2 = this.a.a();
                    this.b = a2;
                    if (a2 instanceof azyr) {
                        Throwable th = ((azyr) a2).a;
                        azvtVar3.resumeWith(false);
                        break;
                    }
                    if (a2 != azyi.d) {
                        azvtVar3.n(true, azvtVar3.f);
                        break;
                    }
                } else {
                    azvr azvrVar = new azvr(azyoVar);
                    azvm azvmVar3 = azvtVar3.d;
                    while (true) {
                        Object obj4 = azvmVar3.a;
                        if (obj4 instanceof azvp) {
                            if (azvtVar3.d.c(obj4, azvrVar)) {
                                break;
                            }
                        } else if (obj4 instanceof azvr) {
                            azvt.m(azvrVar, obj4);
                        } else if (obj4 instanceof azwc) {
                            azwc azwcVar = (azwc) obj4;
                            if (!azwcVar.a()) {
                                azvt.m(azvrVar, obj4);
                            }
                            if (obj4 instanceof azvv) {
                                try {
                                    azvrVar.a(azwcVar != null ? azwcVar.b : null);
                                } catch (Throwable th2) {
                                    azth.k(azvtVar3.b, new azwf(azul.a("Exception in invokeOnCancellation handler for ", azvtVar3), th2));
                                }
                            }
                        } else if ((obj4 instanceof azwb) && ((azwb) obj4).e != null) {
                            azvt.m(azvrVar, obj4);
                        }
                    }
                }
            }
            boolean k = azvtVar3.k();
            azvk azvkVar2 = azvtVar3.c;
            while (true) {
                int i3 = azvkVar2.a;
                if (i3 != 0) {
                    if (i3 == 2) {
                        if (k) {
                            azvtVar3.j();
                        }
                        Object b = azvtVar3.b();
                        if (b instanceof azwc) {
                            Throwable th3 = ((azwc) b).b;
                            if (azwq.b) {
                                throw baab.a(th3, azvtVar3);
                            }
                            throw th3;
                        }
                        if (!azuj.i(azvtVar3.f) || (azxgVar = (azxg) azvtVar3.b.get(azxg.b)) == null || azxgVar.l()) {
                            c = azvtVar3.c(b);
                        } else {
                            CancellationException h = azxgVar.h();
                            azvtVar3.g(b, h);
                            if (azwq.b) {
                                throw baab.a(h, azvtVar3);
                            }
                            throw h;
                        }
                    } else {
                        throw new IllegalStateException("Already suspended".toString());
                    }
                } else if (azvtVar3.c.c(0, 1)) {
                    if (azvtVar3.e == null && (azxgVar2 = (azxg) azvtVar3.b.get(azxg.b)) != null) {
                        azvtVar3.e = azuj.g(azxgVar2, true, new azvw(azvtVar3), 2);
                    }
                    if (k) {
                        azvtVar3.j();
                    }
                    c = azsx.COROUTINE_SUSPENDED;
                }
            }
            azsx azsxVar = azsx.COROUTINE_SUSPENDED;
            return c;
        }
        return Boolean.valueOf(c(this.b));
    }

    @Override // defpackage.azyn
    public final Object b() {
        Object obj = this.b;
        if (obj instanceof azyr) {
            throw null;
        }
        if (obj != azyi.d) {
            this.b = azyi.d;
            return obj;
        }
        throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
    }
}
