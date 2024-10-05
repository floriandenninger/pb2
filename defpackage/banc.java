package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class banc implements banj, bani {
    public final int a;
    private final int b;
    private final int c;
    private final banc[] d;
    private final bane e;

    public banc(int i, int i2, int i3, banc[] bancVarArr) {
        this.b = i;
        this.c = i2;
        this.a = i3;
        this.d = bancVarArr;
        this.e = null;
    }

    public banc(banc bancVar, bane baneVar) {
        this.b = bancVar.b;
        this.c = bancVar.c;
        this.a = bancVar.a;
        this.d = bancVar.d;
        bane baneVar2 = bancVar.e;
        this.e = baneVar2 != null ? new banb(baneVar2, baneVar) : baneVar;
    }

    static final boolean f(bakb bakbVar) {
        int c = bakbVar.c();
        for (int i = 0; i < c; i++) {
            if (bakbVar.b(i) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.banj
    public final int a(bakb bakbVar) {
        long d = d(bakbVar);
        if (d == Long.MAX_VALUE) {
            return 0;
        }
        int max = Math.max(bamx.a(d), this.b);
        if (this.a >= 8) {
            max = Math.max(max, d < 0 ? 5 : 4) + 1;
            if (this.a == 9 && Math.abs(d) % 1000 == 0) {
                max -= 4;
            }
            d /= 1000;
        }
        int i = (int) d;
        bane baneVar = this.e;
        return baneVar != null ? max + baneVar.a(i) : max;
    }

    @Override // defpackage.banj
    public final int b(bakb bakbVar, int i) {
        return (this.c == 4 || d(bakbVar) != Long.MAX_VALUE) ? 1 : 0;
    }

    @Override // defpackage.banj
    public final void c(StringBuffer stringBuffer, bakb bakbVar) {
        long d = d(bakbVar);
        if (d == Long.MAX_VALUE) {
            return;
        }
        int i = (int) d;
        if (this.a >= 8) {
            i = (int) (d / 1000);
        }
        int length = stringBuffer.length();
        if (this.b <= 1) {
            bamx.e(stringBuffer, i);
        } else {
            bamx.d(stringBuffer, i, 2);
        }
        if (this.a >= 8) {
            int abs = (int) (Math.abs(d) % 1000);
            if (this.a == 8 || abs > 0) {
                if (d < 0 && d > -1000) {
                    stringBuffer.insert(length, '-');
                }
                stringBuffer.append('.');
                bamx.d(stringBuffer, abs, 3);
            }
        }
        bane baneVar = this.e;
        if (baneVar != null) {
            baneVar.b(stringBuffer, i);
        }
    }

    final long d(bakb bakbVar) {
        int a;
        long j;
        bajy e = this.c == 4 ? null : bakbVar.e();
        if (e != null && !e(e, this.a)) {
            return Long.MAX_VALUE;
        }
        switch (this.a) {
            case 0:
                a = bakbVar.a(bajr.d);
                j = a;
                break;
            case 1:
                a = bakbVar.a(bajr.e);
                j = a;
                break;
            case 2:
                a = bakbVar.a(bajr.f);
                j = a;
                break;
            case 3:
                a = bakbVar.a(bajr.g);
                j = a;
                break;
            case 4:
                a = bakbVar.a(bajr.i);
                j = a;
                break;
            case 5:
                a = bakbVar.a(bajr.j);
                j = a;
                break;
            case 6:
                a = bakbVar.a(bajr.k);
                j = a;
                break;
            case 7:
                a = bakbVar.a(bajr.l);
                j = a;
                break;
            default:
                j = (bakbVar.a(bajr.k) * 1000) + bakbVar.a(bajr.l);
                break;
        }
        if (j == 0) {
            int i = this.c;
            if (i == 1) {
                if (f(bakbVar)) {
                    banc[] bancVarArr = this.d;
                    int i2 = this.a;
                    if (bancVarArr[i2] == this) {
                        int min = Math.min(i2, 8);
                        while (true) {
                            min--;
                            if (min >= 0 && min <= 9) {
                                if (!e(e, min) || this.d[min] == null) {
                                }
                            }
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
            if (i == 2) {
                if (f(bakbVar)) {
                    banc[] bancVarArr2 = this.d;
                    int i3 = this.a;
                    if (bancVarArr2[i3] == this) {
                        for (int i4 = i3 + 1; i4 <= 9; i4++) {
                            if (e(e, i4) && this.d[i4] != null) {
                                return Long.MAX_VALUE;
                            }
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return j;
    }

    static final boolean e(bajy bajyVar, int i) {
        switch (i) {
            case 0:
                return bajyVar.e(bajr.d);
            case 1:
                return bajyVar.e(bajr.e);
            case 2:
                return bajyVar.e(bajr.f);
            case 3:
                return bajyVar.e(bajr.g);
            case 4:
                return bajyVar.e(bajr.i);
            case 5:
                return bajyVar.e(bajr.j);
            case 6:
                return bajyVar.e(bajr.k);
            case 7:
                return bajyVar.e(bajr.l);
            default:
                return bajyVar.e(bajr.k) || bajyVar.e(bajr.l);
        }
    }
}
