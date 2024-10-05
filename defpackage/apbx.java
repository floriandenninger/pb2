package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbx extends aonm implements aooz {
    public static final apbx a;
    private static volatile aopf g;
    public int b;
    public avgg c;
    public aqyg d;
    public apxf e;
    private aqyg h;
    private aota i;
    private byte j = 2;
    public aomf f = aomf.b;

    static {
        apbx apbxVar = new apbx();
        a = apbxVar;
        aonm.registerDefaultInstance(apbx.class, apbxVar);
    }

    private apbx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "h", "e", "f", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new apbx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apbx.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
