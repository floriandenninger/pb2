package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apot extends aonm implements aooz {
    public static final apot a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public aony d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private apov l;
    private aqyg m;
    private aqyg n;
    private apoy o;
    private apow p;
    private apox q;
    private apos r;
    private apxf s;
    private apou t;
    private apxf u;
    private byte v = 2;

    static {
        apot apotVar = new apot();
        a = apotVar;
        aonm.registerDefaultInstance(apot.class, apotVar);
    }

    private apot() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0012\u0000\u0001\u0001\u001f\u0012\u0000\u0001\u0012\u0001ᐉ\u0002\u0002Л\u0004ᐉ\u0007\u0005ᐉ\b\u0006ᐉ\n\u0007ᐉ\f\bᐉ\r\tᐉ\u000e\nᐉ\u000f\fᐉ\u0010\u0012ᐉ\u0015\u0013ᐉ\u0000\u0015ᐉ\u0005\u0016ᐉ\u0006\u0018ᐉ\u0003\u001cᐉ\t\u001eᐉ\u0016\u001fᐉ\u000b", new Object[]{"b", "c", "d", apon.class, "e", "f", "g", "o", "p", "q", "r", "s", "t", "i", "k", "l", "j", "m", "u", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new apot();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apot.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
