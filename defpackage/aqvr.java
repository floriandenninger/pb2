package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqvr extends aonm implements aooz {
    public static final aqvr a;
    private static volatile aopf g;
    public aweh c;
    public int e;
    private int h;
    private byte i = 2;
    public aony b = aonm.emptyProtobufList();
    public String d = "";
    public String f = "";

    static {
        aqvr aqvrVar = new aqvr();
        a = aqvrVar;
        aonm.registerDefaultInstance(aqvr.class, aqvrVar);
    }

    private aqvr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001a\u0002ဉ\u0000\u0003ဈ\u0001\u0004ဌ\u0002\u0005ဈ\u0003", new Object[]{"h", "b", "c", "d", "e", aquw.f, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqvr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqvr.class) {
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
