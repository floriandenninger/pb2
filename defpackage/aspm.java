package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspm extends aonm implements aooz {
    public static final aspm a;
    private static volatile aopf h;
    public int b;
    public aqyg e;
    public aqyg f;
    public avgg g;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private apxf m;
    private byte n = 2;
    public String c = "";
    public String d = "";

    static {
        aspm aspmVar = new aspm();
        a = aspmVar;
        aonm.registerDefaultInstance(aspm.class, aspmVar);
    }

    private aspm() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\b\u0001ဈ\u0000\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ဈ\u0003\bᐉ\n\nᐉ\b\u000bᐉ\t\rᐉ\u0002", new Object[]{"b", "c", "e", "f", "j", "g", "d", "m", "k", "l", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aspm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aspm.class) {
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
