package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxf extends aonh implements aoni {
    public static final apxf a;
    private static volatile aopf f;
    public int b;
    public apxg e;
    private byte g = 2;
    public aomf c = aomf.b;
    public aony d = emptyProtobufList();

    static {
        apxf apxfVar = new apxf();
        a = apxfVar;
        aonm.registerDefaultInstance(apxf.class, apxfVar);
    }

    private apxf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0001\u0001\u0002ည\u0000\u0003\u001b\u0004ᐉ\u0001", new Object[]{"b", "c", "d", asus.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apxf();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (apxf.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
