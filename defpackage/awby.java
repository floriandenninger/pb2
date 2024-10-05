package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awby extends aonm implements aooz {
    public static final awby a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        awby awbyVar = new awby();
        a = awbyVar;
        aonm.registerDefaultInstance(awby.class, awbyVar);
    }

    private awby() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0001\u0000ﺯ䨣免厯\u0003\u0000\u0000\u0003ﺯ䨣ᐼ\u0000\ue14e䨥ᐼ\u0000免厯ᐼ\u0000", new Object[]{"c", "b", awca.class, awbx.class, awbu.class});
            case NEW_MUTABLE_INSTANCE:
                return new awby();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awby.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
