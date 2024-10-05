package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asps extends aonm implements aooz {
    public static final asps a;
    private static volatile aopf n;
    public int b;
    public long d;
    public aqyg e;
    public aqyg g;
    public aqyg h;
    public avgg i;
    public aqyg k;
    public aqyg l;
    public apxf m;
    private byte o = 2;
    public String c = "";
    public String f = "";
    public aony j = emptyProtobufList();

    static {
        asps aspsVar = new asps();
        a = aspsVar;
        aonm.registerDefaultInstance(asps.class, aspsVar);
    }

    private asps() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\b\u0001ᐉ\u0004\u0002ᐉ\u0005\u0003ᐉ\u0006\u0004ᐉ\t\u0005ဈ\u0000\u0006ဃ\u0001\u0007Л\bဈ\u0003\tᐉ\u0007\nᐉ\b\rᐉ\u0002", new Object[]{"b", "g", "h", "i", "m", "c", "d", "j", asor.class, "f", "k", "l", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asps();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (asps.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
