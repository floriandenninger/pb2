package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxi extends aonm implements aooz {
    public static final apxi a;
    private static volatile aopf h;
    public int b;
    public apxf c;
    public apxf d;
    public awdy e;
    private aota i;
    private byte j = 2;
    public aomf f = aomf.b;
    public aony g = emptyProtobufList();

    static {
        apxi apxiVar = new apxi();
        a = apxiVar;
        aonm.registerDefaultInstance(apxi.class, apxiVar);
    }

    private apxi() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007\u001b", new Object[]{"b", "c", "d", "e", "i", "f", "g", apua.class});
            case NEW_MUTABLE_INSTANCE:
                return new apxi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apxi.class) {
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
