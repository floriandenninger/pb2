package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atey extends aonm implements aooz {
    public static final atey a;
    private static volatile aopf t;
    private byte A = 2;
    public int b;
    public aqyg c;
    public aqyg d;
    public atex e;
    public atex f;
    public aulq g;
    public aulq h;
    public atew i;
    public aulq j;
    public aulq k;
    public avgg l;
    public aqyg m;
    public aqyg n;
    public aqyg o;
    public arfs p;
    public boolean q;
    public boolean r;
    public aulq s;
    private atez u;
    private atev v;
    private aulq w;
    private aulq x;
    private athf y;
    private aqyg z;

    static {
        atey ateyVar = new atey();
        a = ateyVar;
        aonm.registerDefaultInstance(atey.class, ateyVar);
    }

    private atey() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.A);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.A = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0000\u0015\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\b\u0006ᐉ\u0005\u0007ᐉ\t\bᐉ\n\tᐉ\r\nᐉ\u0006\u000bᐉ\u0007\fᐉ\f\rᐉ\u000e\u000eᐉ\u000f\u0010ᐉ\u000b\u0011ᐉ\u0001\u0012ᐉ\u0010\u0013ᐉ\u0011\u0015ဇ\u0013\u0016ᐉ\u0014\u0017ᐉ\u0015\u0019ဇ\u0017\u001aᐉ\u0018", new Object[]{"b", "c", "e", "f", "u", "i", "v", "j", "w", "l", "g", "h", "k", "m", "n", "x", "d", "o", "p", "q", "y", "z", "r", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new atey();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (atey.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
