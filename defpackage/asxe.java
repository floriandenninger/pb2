package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxe extends aonm implements aooz {
    public static final asxe a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public String d = "";
    public String e;
    public aony f;
    public String g;
    public awjm h;
    public aomf i;

    static {
        asxe asxeVar = new asxe();
        a = asxeVar;
        aonm.registerDefaultInstance(asxe.class, asxeVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, asxeVar, asxeVar, null, 137, aoqn.MESSAGE, asxe.class);
    }

    private asxe() {
        aomf aomfVar = aomf.b;
        this.e = "";
        this.f = emptyProtobufList();
        this.g = "";
        this.i = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0004\u001b\u0005ဈ\u0003\u0006ဉ\u0004\u0007ည\u0005", new Object[]{"c", "d", "e", "f", aqll.class, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asxe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (asxe.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
