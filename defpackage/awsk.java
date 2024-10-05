package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsk extends aonm implements aooz {
    private static final awsk a;
    private static volatile aopf b;
    private int c;
    private awsn d;
    private awnw e;
    private awpu f;
    private byte g = 2;

    static {
        awsk awskVar = new awsk();
        a = awskVar;
        aonm.registerDefaultInstance(awsk.class, awskVar);
    }

    private awsk() {
    }

    public static awsj a() {
        return (awsj) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(awnw awnwVar) {
        awnwVar.getClass();
        this.e = awnwVar;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(awsn awsnVar) {
        this.d = awsnVar;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(awpu awpuVar) {
        awpuVar.getClass();
        this.f = awpuVar;
        this.c |= 4;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awsk();
            case NEW_BUILDER:
                return new awsj();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awsk.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
