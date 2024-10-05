package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqpc extends aonm implements aooz {
    public static final aqpc a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public long f;
    public long g;
    public aqpb i;
    public String d = "";
    public aony e = emptyProtobufList();
    public String h = "";

    static {
        aqpc aqpcVar = new aqpc();
        a = aqpcVar;
        aonm.registerDefaultInstance(aqpc.class, aqpcVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, aqpcVar, aqpcVar, null, 146, aoqn.MESSAGE, aqpc.class);
    }

    private aqpc() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဉ\u0004", new Object[]{"c", "d", "e", aqpd.class, "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqpc();
            case NEW_BUILDER:
                return new aone((float[]) null, (short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqpc.class) {
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
