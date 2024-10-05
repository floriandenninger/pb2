package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhx extends aonm implements aooz {
    public static final auhx a;
    private static volatile aopf h;
    public int b;
    public aulq c;
    public aoxy e;
    private aota i;
    private byte j = 2;
    public aony d = emptyProtobufList();
    public aomf f = aomf.b;
    public String g = "";

    static {
        auhx auhxVar = new auhx();
        a = auhxVar;
        aonm.registerDefaultInstance(auhx.class, auhxVar);
    }

    private auhx() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0001\u0006ဈ\u0004", new Object[]{"b", "c", "d", apxf.class, "i", "f", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new auhx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (auhx.class) {
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
