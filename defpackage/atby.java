package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atby extends aonm implements aooz {
    public static final atby a;
    private static volatile aopf m;
    public int b;
    public int e;
    public atbu f;
    public atbu g;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public aony h = emptyProtobufList();
    public aony i = emptyProtobufList();
    public aony j = aonm.emptyProtobufList();
    public aony k = aonm.emptyProtobufList();
    public aony l = emptyProtobufList();

    static {
        atby atbyVar = new atby();
        a = atbyVar;
        aonm.registerDefaultInstance(atby.class, atbyVar);
    }

    private atby() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0007\u0000\u0001\u001b\u0002\u001b\u0003ဌ\u0000\u0004ဉ\u0001\bဉ\u0005\u000b\u001b\f\u001b\r\u001a\u000e\u001a\u000f\u001b", new Object[]{"b", "c", atbv.class, "d", atbv.class, "e", atbk.f, "f", "g", "h", atbx.class, "i", atbw.class, "j", "k", "l", atbt.class});
            case NEW_MUTABLE_INSTANCE:
                return new atby();
            case NEW_BUILDER:
                return new aone((int[]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (atby.class) {
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
