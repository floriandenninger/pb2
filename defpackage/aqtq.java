package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqtq extends aonm implements aooz {
    public static final aqtq a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        aqtq aqtqVar = new aqtq();
        a = aqtqVar;
        aonm.registerDefaultInstance(aqtq.class, aqtqVar);
    }

    private aqtq() {
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
                return newMessageInfo(a, "\u0001\u0010\u0001\u0000\ue7f5ណ\ue94e딛\u0010\u0000\u0000\u0010\ue7f5ណᐼ\u0000ﯡ䥼ᐼ\u0000\uf72c䰍ᐼ\u0000禮猞ᐼ\u0000ﲵ猶ᐼ\u0000連砆ᐼ\u0000\ued5f竊ᐼ\u0000\ue48e繓ᐼ\u0000\ue0aa詙ᐼ\u0000\uf599鎒ᐼ\u0000\uf7f8頧ᐼ\u0000\uec75鬳ᐼ\u0000ﺪ鴡ᐼ\u0000\ue2cdꟊᐼ\u0000ﹹ녆ᐼ\u0000\ue94e딛ᐼ\u0000", new Object[]{"c", "b", auov.class, aviw.class, aqex.class, apwn.class, apwp.class, apws.class, aovn.class, apbp.class, aqtt.class, asvq.class, aunw.class, atcn.class, aufo.class, auzc.class, aqxd.class, aqag.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqtq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqtq.class) {
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
