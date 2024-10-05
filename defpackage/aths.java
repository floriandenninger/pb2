package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aths extends aonm implements aooz {
    public static final aths a;
    private static volatile aopf k;
    public int b;
    public Object d;
    public Object f;
    public athr h;
    public boolean i;
    private aota l;
    public int c = 0;
    public int e = 0;
    private byte m = 2;
    public aomf g = aomf.b;
    public String j = "";

    static {
        aths athsVar = new aths();
        a = athsVar;
        aonm.registerDefaultInstance(aths.class, athsVar);
    }

    private aths() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0002\u0001\u0001\r\t\u0000\u0000\u0006\u0001ᐼ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0001\u0004ᐼ\u0001\u0005ᐉ\u0004\u0006ည\u0005\u000bᐉ\n\fဇ\u000b\rဈ\f", new Object[]{"d", "c", "f", "e", "b", arfs.class, avgg.class, atho.class, apxf.class, "l", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aths();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (aths.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
