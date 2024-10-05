package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azsp implements Serializable, azsv {
    private final azsv a;
    private final azss b;

    public azsp(azsv azsvVar, azss azssVar) {
        azsvVar.getClass();
        this.a = azsvVar;
        this.b = azssVar;
    }

    private final int a() {
        int i = 2;
        azsp azspVar = this;
        while (true) {
            azsv azsvVar = azspVar.a;
            if (true != (azsvVar instanceof azsp)) {
                azsvVar = null;
            }
            azspVar = (azsp) azsvVar;
            if (azspVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(azss azssVar) {
        return azul.c(get(azssVar.getKey()), azssVar);
    }

    private final Object writeReplace() {
        int a = a();
        azsv[] azsvVarArr = new azsv[a];
        azun azunVar = new azun();
        azunVar.a = 0;
        fold(azsf.a, new azso(azsvVarArr, azunVar));
        if (azunVar.a != a) {
            throw new IllegalStateException("Check failed.".toString());
        }
        return new azsn(azsvVarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof azsp) {
            azsp azspVar = (azsp) obj;
            if (azspVar.a() == a()) {
                azsp azspVar2 = this;
                while (true) {
                    if (!azspVar.b(azspVar2.b)) {
                        break;
                    }
                    azsv azsvVar = azspVar2.a;
                    if (!(azsvVar instanceof azsp)) {
                        if (azspVar.b((azss) azsvVar)) {
                            return true;
                        }
                    } else {
                        azspVar2 = (azsp) azsvVar;
                    }
                }
                return false;
            }
        }
        return false;
    }

    @Override // defpackage.azsv
    public final Object fold(Object obj, azty aztyVar) {
        return aztyVar.invoke(this.a.fold(obj, aztyVar), this.b);
    }

    @Override // defpackage.azsv
    public final azss get(azst azstVar) {
        azstVar.getClass();
        azsp azspVar = this;
        while (true) {
            azss azssVar = azspVar.b.get(azstVar);
            if (azssVar != null) {
                return azssVar;
            }
            azsv azsvVar = azspVar.a;
            if (azsvVar instanceof azsp) {
                azspVar = (azsp) azsvVar;
            } else {
                return azsvVar.get(azstVar);
            }
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.azsv
    public final azsv minusKey(azst azstVar) {
        azstVar.getClass();
        if (this.b.get(azstVar) != null) {
            return this.a;
        }
        azsv minusKey = this.a.minusKey(azstVar);
        return minusKey != this.a ? minusKey == azsw.a ? this.b : new azsp(minusKey, this.b) : this;
    }

    @Override // defpackage.azsv
    public final azsv plus(azsv azsvVar) {
        azsvVar.getClass();
        return azth.e(this, azsvVar);
    }

    public final String toString() {
        return "[" + ((String) fold("", azsu.b)) + "]";
    }
}
