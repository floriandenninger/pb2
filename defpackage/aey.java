package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aey {
    protected final afa b;
    private final aez g;
    int a = 0;
    private int h = 8;
    public int[] c = new int[8];
    public int[] d = new int[8];
    public float[] e = new float[8];
    public int f = -1;
    private int i = -1;
    private boolean j = false;

    public aey(aez aezVar, afa afaVar) {
        this.g = aezVar;
        this.b = afaVar;
    }

    public final float a(aff affVar) {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            if (this.c[i] != affVar.c) {
                i = this.d[i];
            } else {
                return this.e[i];
            }
        }
        return 0.0f;
    }

    public final float c(aff affVar, boolean z) {
        int i = this.f;
        if (i != -1) {
            int i2 = 0;
            int i3 = -1;
            while (i != -1 && i2 < this.a) {
                if (this.c[i] != affVar.c) {
                    i2++;
                    i3 = i;
                    i = this.d[i];
                } else {
                    if (i == this.f) {
                        this.f = this.d[i];
                    } else {
                        int[] iArr = this.d;
                        iArr[i3] = iArr[i];
                    }
                    if (z) {
                        affVar.b(this.g);
                    }
                    affVar.l--;
                    this.a--;
                    this.c[i] = -1;
                    if (this.j) {
                        this.i = i;
                    }
                    return this.e[i];
                }
            }
        }
        return 0.0f;
    }

    public final void f() {
        int i = this.f;
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            aff affVar = this.b.a[this.c[i]];
            if (affVar != null) {
                affVar.b(this.g);
            }
            i = this.d[i];
        }
        this.f = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final void g(aff affVar, float f) {
        if (f == 0.0f) {
            c(affVar, true);
            return;
        }
        int i = this.f;
        if (i != -1) {
            int i2 = -1;
            for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                int i4 = this.c[i];
                int i5 = affVar.c;
                if (i4 != i5) {
                    if (i4 < i5) {
                        i2 = i;
                    }
                    i = this.d[i];
                } else {
                    this.e[i] = f;
                    return;
                }
            }
            int i6 = this.i;
            int i7 = i6 + 1;
            if (this.j) {
                int[] iArr = this.c;
                if (iArr[i6] != -1) {
                    i6 = iArr.length;
                }
            } else {
                i6 = i7;
            }
            int length = this.c.length;
            if (i6 >= length && this.a < length) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.c;
                    if (i8 >= iArr2.length) {
                        break;
                    }
                    if (iArr2[i8] == -1) {
                        i6 = i8;
                        break;
                    }
                    i8++;
                }
            }
            int length2 = this.c.length;
            if (i6 >= length2) {
                int i9 = this.h;
                int i10 = i9 + i9;
                this.h = i10;
                this.j = false;
                this.i = length2 - 1;
                this.e = Arrays.copyOf(this.e, i10);
                this.c = Arrays.copyOf(this.c, this.h);
                this.d = Arrays.copyOf(this.d, this.h);
                i6 = length2;
            }
            this.c[i6] = affVar.c;
            this.e[i6] = f;
            if (i2 != -1) {
                int[] iArr3 = this.d;
                iArr3[i6] = iArr3[i2];
                iArr3[i2] = i6;
            } else {
                this.d[i6] = this.f;
                this.f = i6;
            }
            affVar.l++;
            affVar.a(this.g);
            int i11 = this.a + 1;
            this.a = i11;
            if (!this.j) {
                this.i++;
            }
            int length3 = this.c.length;
            if (i11 >= length3) {
                this.j = true;
            }
            if (this.i >= length3) {
                this.j = true;
                this.i = length3 - 1;
                return;
            }
            return;
        }
        this.f = 0;
        this.e[0] = f;
        this.c[0] = affVar.c;
        this.d[0] = -1;
        affVar.l++;
        affVar.a(this.g);
        this.a++;
        if (this.j) {
            return;
        }
        int i12 = this.i + 1;
        this.i = i12;
        int length4 = this.c.length;
        if (i12 >= length4) {
            this.j = true;
            this.i = length4 - 1;
        }
    }

    public final String toString() {
        int i = this.f;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.a; i2++) {
            String valueOf = String.valueOf(String.valueOf(str).concat(" -> "));
            float f = this.e[i];
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append(valueOf);
            sb.append(f);
            sb.append(" : ");
            String valueOf2 = String.valueOf(sb.toString());
            String valueOf3 = String.valueOf(this.b.a[this.c[i]]);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
            sb2.append(valueOf2);
            sb2.append(valueOf3);
            str = sb2.toString();
            i = this.d[i];
        }
        return str;
    }

    public final float b(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.e[i2];
            }
            i2 = this.d[i2];
        }
        return 0.0f;
    }

    public final aff d(int i) {
        int i2 = this.f;
        for (int i3 = 0; i2 != -1 && i3 < this.a; i3++) {
            if (i3 == i) {
                return this.b.a[this.c[i2]];
            }
            i2 = this.d[i2];
        }
        return null;
    }

    public final void e(aff affVar, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f;
            if (i != -1) {
                int i2 = -1;
                for (int i3 = 0; i != -1 && i3 < this.a; i3++) {
                    int i4 = this.c[i];
                    int i5 = affVar.c;
                    if (i4 != i5) {
                        if (i4 < i5) {
                            i2 = i;
                        }
                        i = this.d[i];
                    } else {
                        float[] fArr = this.e;
                        float f2 = fArr[i] + f;
                        if (f2 > -0.001f && f2 < 0.001f) {
                            f2 = 0.0f;
                        }
                        fArr[i] = f2;
                        if (f2 == 0.0f) {
                            if (i == this.f) {
                                this.f = this.d[i];
                            } else {
                                int[] iArr = this.d;
                                iArr[i2] = iArr[i];
                            }
                            if (z) {
                                affVar.b(this.g);
                            }
                            if (this.j) {
                                this.i = i;
                            }
                            affVar.l--;
                            this.a--;
                            return;
                        }
                        return;
                    }
                }
                int i6 = this.i;
                int i7 = i6 + 1;
                if (this.j) {
                    int[] iArr2 = this.c;
                    if (iArr2[i6] != -1) {
                        i6 = iArr2.length;
                    }
                } else {
                    i6 = i7;
                }
                int length = this.c.length;
                if (i6 >= length && this.a < length) {
                    int i8 = 0;
                    while (true) {
                        int[] iArr3 = this.c;
                        if (i8 >= iArr3.length) {
                            break;
                        }
                        if (iArr3[i8] == -1) {
                            i6 = i8;
                            break;
                        }
                        i8++;
                    }
                }
                int length2 = this.c.length;
                if (i6 >= length2) {
                    int i9 = this.h;
                    int i10 = i9 + i9;
                    this.h = i10;
                    this.j = false;
                    this.i = length2 - 1;
                    this.e = Arrays.copyOf(this.e, i10);
                    this.c = Arrays.copyOf(this.c, this.h);
                    this.d = Arrays.copyOf(this.d, this.h);
                    i6 = length2;
                }
                this.c[i6] = affVar.c;
                this.e[i6] = f;
                if (i2 != -1) {
                    int[] iArr4 = this.d;
                    iArr4[i6] = iArr4[i2];
                    iArr4[i2] = i6;
                } else {
                    this.d[i6] = this.f;
                    this.f = i6;
                }
                affVar.l++;
                affVar.a(this.g);
                this.a++;
                if (!this.j) {
                    this.i++;
                }
                int i11 = this.i;
                int length3 = this.c.length;
                if (i11 >= length3) {
                    this.j = true;
                    this.i = length3 - 1;
                    return;
                }
                return;
            }
            this.f = 0;
            this.e[0] = f;
            this.c[0] = affVar.c;
            this.d[0] = -1;
            affVar.l++;
            affVar.a(this.g);
            this.a++;
            if (this.j) {
                return;
            }
            int i12 = this.i + 1;
            this.i = i12;
            int length4 = this.c.length;
            if (i12 >= length4) {
                this.j = true;
                this.i = length4 - 1;
            }
        }
    }
}
