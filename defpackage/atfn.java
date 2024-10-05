package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atfn extends aonm implements aooz {
    public static final atfn a;
    private static volatile aopf s;
    public int b;
    public avgg c;
    public atfm d;
    public aulq e;
    public atfl f;
    public atfi g;
    public aulq h;
    public aulq i;
    public atfh j;
    public aulq k;
    public aulq l;
    public aulq m;
    public aulq n;
    public aulq o;
    public boolean p;
    public aulq q;
    public aulq r;
    private atfk t;
    private atfk u;
    private atfg v;
    private atfj w;
    private byte x = 2;

    static {
        atfn atfnVar = new atfn();
        a = atfnVar;
        aonm.registerDefaultInstance(atfn.class, atfnVar);
    }

    private atfn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0013\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\tᐉ\u000b\nᐉ\f\fᐉ\u000e\rᐉ\u000f\u000eᐉ\r\u000fᐉ\u0010\u0010ᐉ\u0002\u0011ᐉ\t\u0012ᐉ\n\u0013ဇ\u0011\u0014ᐉ\u0012\u0015ᐉ\u0013", new Object[]{"b", "c", "d", "f", "t", "u", "g", "v", "w", "j", "k", "m", "n", "l", "o", "e", "h", "i", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new atfn();
            case NEW_BUILDER:
                return new aone((boolean[][]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (atfn.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
