package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apfn extends aonm implements aooz {
    public static final apfn a;
    private static volatile aopf w;
    public int b;
    public aqyg c;
    public aulq d;
    public aqyg e;
    public aulq f;
    public avgg g;
    public aulq h;
    public float i;
    public int j;
    public aqyg k;
    public apxf l;
    public apxf m;
    public aulq n;
    public aulq o;
    public atdf p;
    public apxf r;
    public aqev s;
    public int t;
    public aulq v;
    private aota x;
    private byte y = 2;
    public aony q = emptyProtobufList();
    public aomf u = aomf.b;

    static {
        apfn apfnVar = new apfn();
        a = apfnVar;
        aonm.registerDefaultInstance(apfn.class, apfnVar);
    }

    private apfn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.y);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0001\u0017\u0015\u0000\u0001\u0010\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ခ\u0006\u0005ᐉ\b\u0006ᐉ\t\u0007ᐉ\r\bᐉ\u0012\tည\u0013\u000bЛ\fᐉ\u0014\u000eᐉ\u0001\u000fᐉ\u0003\u0010ᐉ\u0005\u0011ဉ\u0010\u0012ဋ\u0011\u0013ᐉ\u000b\u0014ဌ\u0007\u0015ᐉ\f\u0016ᐉ\u000e\u0017ᐉ\n", new Object[]{"b", "c", "e", "g", "i", "k", "l", "p", "x", "u", "q", apxf.class, "v", "d", "f", "h", "s", "t", "n", "j", aufb.s, "o", "r", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new apfn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = w;
                if (aopfVar == null) {
                    synchronized (apfn.class) {
                        aopfVar = w;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            w = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
