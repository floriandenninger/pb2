package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arvu extends aonm implements aooz {
    public static final arvu a;
    private static volatile aopf e;
    private arvy A;
    private arvy B;
    private arvy C;
    private arvy D;
    private arvy E;
    private arvy F;
    private arvy G;
    private arvy H;
    private arvy I;

    /* renamed from: J, reason: collision with root package name */
    private arvy f110J;
    private arvy K;
    private arvy L;
    private arvy M;
    private arvy N;
    private arvy O;
    private arvy P;
    private arvy Q;
    private arvy R;
    private arvy S;
    private arvy T;
    private arvy U;
    private arvy V;
    private arvy W;
    private arvy X;
    private arvy Y;
    private arvy Z;
    private arvy aa;
    private arvy ab;
    private arvy ac;
    private arvy ad;
    private arvy ae;
    private arvy af;
    private arvy ag;
    private arvy ah;
    private arvy ai;
    private arvy aj;
    private arvy ak;
    private arvy al;
    private arvy am;
    private arvy an;
    private arvy ao;
    private arvy ap;
    private arvy aq;
    private arvy ar;
    private arvw as;
    private arvv at;
    private aqhd au;
    private aqzg av;
    private byte aw = 2;
    public int b;
    public arnd c;
    public arvx d;
    private int f;
    private int g;
    private apxf h;
    private arvy i;
    private arvy j;
    private arvy k;
    private arvy l;
    private arvy m;
    private arvy n;
    private arvy o;
    private arvy p;
    private arvy q;
    private arvy r;
    private arvy s;
    private arvy t;
    private arvy u;
    private arvy v;
    private arvy w;
    private arvy x;
    private arvy y;
    private arvy z;

    static {
        arvu arvuVar = new arvu();
        a = arvuVar;
        aonm.registerDefaultInstance(arvu.class, arvuVar);
    }

    private arvu() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.aw);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.aw = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001E\u0000\u0003\u0001̉E\u0000\u0000E\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nᐉ\n\u000bᐉ\u000b\fᐉ\f\rᐉ\r\u000fᐉA\u0010ᐉB\u0011ᐉ\u000e\u0012ᐉ\u000f\u0013ᐉ\u0010\u0014ᐉ\u0011\u0015ᐉ\u0016\u0016ᐉ\u0017\u0017ᐉ\u0018\u0018ᐉ\u0019\u0019ᐉ\u001b\u001aᐉ\u001c\u001bᐉ\u001d\u001cᐉC\u001dᐉ\u001e\u001eᐉ\u001f\u001fᐉ  ᐉ!!ᐉ\"\"ᐉ#$ᐉ%%ᐉ&(ᐉ')ᐉ(*ᐉ)+ᐉ*,ᐉ,-ᐉ..ᐉ//ᐉ00ᐉ11ᐉ\u00062ᐉ+3ᐉ45ᐉ26ᐉ37ᐉ-8ᐉ59ᐉ6:ᐉ7;ᐉ\u0012<ᐉ\u0013=ᐉ\u0014>ᐉ\u0015?ᐉ$@ᐉ8Aᐉ9Bᐉ:Cᐉ;Dᐉ<Eᐉ=Fᐉ>Gᐉ?Hᐉ\u001aIᐉ@̉ᐉD", new Object[]{"b", "f", "g", "c", "h", "d", "i", "j", "k", "m", "n", "o", "p", "q", "r", "s", "as", "at", "t", "u", "v", "w", "B", "C", "D", "E", "G", "H", "I", "au", "J", "K", "L", "M", "N", "O", "Q", "R", "S", "T", "U", "V", "X", "Z", "aa", "ab", "ac", "l", "W", "af", "ad", "ae", "Y", "ag", "ah", "ai", "x", "y", "z", "A", "P", "aj", "ak", "al", "am", "an", "ao", "ap", "aq", "F", "ar", "av"});
            case NEW_MUTABLE_INSTANCE:
                return new arvu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (arvu.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
