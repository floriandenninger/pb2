package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avwv extends aonm implements aooz {
    public static final avwv a;
    private static volatile aopf e;
    public int b;
    public aony c = aonm.emptyProtobufList();
    public avwu d;

    static {
        avwv avwvVar = new avwv();
        a = avwvVar;
        aonm.registerDefaultInstance(avwv.class, avwvVar);
    }

    private avwv() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new avwv();
            case NEW_BUILDER:
                return new aone((short[]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avwv.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
