package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class babs extends aonm implements aooz {
    public static final babs a;
    private static volatile aopf c;
    private byte d = 2;
    public aony b = emptyProtobufList();

    static {
        babs babsVar = new babs();
        a = babsVar;
        aonm.registerDefaultInstance(babs.class, babsVar);
    }

    private babs() {
    }

    public final void a() {
        aony aonyVar = this.b;
        if (aonyVar.c()) {
            return;
        }
        this.b = aonm.mutableCopy(aonyVar);
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", babr.class});
            case NEW_MUTABLE_INSTANCE:
                return new babs();
            case NEW_BUILDER:
                return new aone((byte[][][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (babs.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
