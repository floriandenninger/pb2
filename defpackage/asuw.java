package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asuw extends aonm implements aooz {
    public static final asuw a;
    private static volatile aopf m;
    public int b;
    public asuv d;
    public asuv e;
    public avgg f;
    public avgg g;
    public apxf h;
    public aqyg i;
    public aott j;
    public asuh l;
    private byte n = 2;
    public String c = "";
    public String k = "";

    static {
        asuw asuwVar = new asuw();
        a = asuwVar;
        aonm.registerDefaultInstance(asuw.class, asuwVar);
    }

    private asuw() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001ϧ\n\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ဉ\u0007\bᐉ\u0003\tᐉ\u0004\nဈ\bϧᐉ\t", new Object[]{"b", "c", "d", "e", "h", "i", "j", "f", "g", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new asuw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (asuw.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
