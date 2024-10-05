package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aveu extends aonm implements aooz {
    public static final aveu a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public Object e;
    public long g;
    public int d = 0;
    public String f = "";
    public aony h = aonm.emptyProtobufList();

    static {
        aveu aveuVar = new aveu();
        a = aveuVar;
        aonm.registerDefaultInstance(aveu.class, aveuVar);
        b = aonm.newSingularGeneratedExtension(aqro.a, aveuVar, aveuVar, null, 196886555, aoqn.MESSAGE, aveu.class);
    }

    private aveu() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ွ\u0000\u0003်\u0000\u0004ဂ\u0003\u0005\u001a", new Object[]{"e", "d", "c", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aveu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aveu.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
