package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auoz extends aonm implements aooz {
    public static final auoz a;
    public static final aonk b;
    private static volatile aopf e;
    public aqew c;
    private int f;
    private byte g = 2;
    public String d = "";

    static {
        auoz auozVar = new auoz();
        a = auozVar;
        aonm.registerDefaultInstance(auoz.class, auozVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, auozVar, auozVar, null, 354135686, aoqn.MESSAGE, auoz.class);
    }

    private auoz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"f", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new auoz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auoz.class) {
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
