package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ovs extends aonm implements aooz {
    public static final ovs a;
    private static volatile aopf k;
    public int b;
    public ovg d;
    public arxh e;
    public int g;
    public int h;
    public ovv i;
    public int j;
    private byte l = 2;
    public aony c = aonm.emptyProtobufList();
    public aomf f = aomf.b;

    static {
        ovs ovsVar = new ovs();
        a = ovsVar;
        aonm.registerDefaultInstance(ovs.class, ovsVar);
    }

    private ovs() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0001\u0001\u0001\u001a\u0002ဉ\u0000\u0003ᐉ\u0001\u0004ည\u0002\u0005င\u0003\u0006င\u0004\nဉ\u0007\rဌ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", aosz.a()});
            case NEW_MUTABLE_INSTANCE:
                return new ovs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (ovs.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
