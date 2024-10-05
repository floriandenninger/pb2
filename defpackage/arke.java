package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arke extends aonm implements aooz {
    public static final arke a;
    private static volatile aopf f;
    public int b;
    public boolean d;
    public boolean e;
    private byte g = 2;
    public aony c = emptyProtobufList();

    static {
        arke arkeVar = new arke();
        a = arkeVar;
        aonm.registerDefaultInstance(arke.class, arkeVar);
    }

    private arke() {
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
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"b", "c", arjy.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new arke();
            case NEW_BUILDER:
                return new aone((short[][]) null, (short[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arke.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
