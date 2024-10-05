package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avvf extends aonm implements aooz {
    public static final avvf a;
    private static volatile aopf f;
    public int c;
    public boolean d;
    public boolean e;
    private int g;
    private byte h = 2;
    public aony b = emptyProtobufList();

    static {
        avvf avvfVar = new avvf();
        a = avvfVar;
        aonm.registerDefaultInstance(avvf.class, avvfVar);
    }

    private avvf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဇ\u0001\u0004ဇ\u0002", new Object[]{"g", "b", avve.class, "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avvf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avvf.class) {
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
