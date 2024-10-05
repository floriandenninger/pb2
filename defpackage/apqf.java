package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apqf extends aonm implements aooz {
    public static final apqf a;
    private static volatile aopf d;
    public int b;
    public aqyg c;
    private int e;
    private byte f = 2;

    static {
        apqf apqfVar = new apqf();
        a = apqfVar;
        aonm.registerDefaultInstance(apqf.class, apqfVar);
    }

    private apqf() {
        aonm.emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0001\u0002ဌ\u0001\u0004ᐉ\u0002", new Object[]{"e", "b", apld.t, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new apqf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (apqf.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
