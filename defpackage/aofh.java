package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aofh extends aonm implements aooz {
    public static final aofh a;
    private static volatile aopf e;
    public int b;
    public aony c = emptyProtobufList();
    public aofj d;

    static {
        aofh aofhVar = new aofh();
        a = aofhVar;
        aonm.registerDefaultInstance(aofh.class, aofhVar);
    }

    private aofh() {
    }

    public final void a() {
        aony aonyVar = this.c;
        if (aonyVar.c()) {
            return;
        }
        this.c = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"b", "c", aoff.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aofh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aofh.class) {
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
