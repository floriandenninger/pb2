package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auou extends aonm implements aooz {
    public static final auou a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        auou auouVar = new auou();
        a = auouVar;
        aonm.registerDefaultInstance(auou.class, auouVar);
    }

    private auou() {
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
                return newMessageInfo(a, "\u0001\u0013\u0001\u0000\ue9db⫩\ue3a4篸\u0013\u0000\u0000\u0013\ue9db⫩ᐼ\u0000履⭎ᐼ\u0000\uf73e㍽ᐼ\u0000\uf707㥚ᐼ\u0000\ue162㥴ᐼ\u0000\ue4a3㱾ᐼ\u0000\uf225㵔ᐼ\u0000\uea01䆵ᐼ\u0000\ue0a6䎫ᐼ\u0000\ue539丘ᐼ\u0000\ue275凔ᐼ\u0000\ueb7a怋ᐼ\u0000\uf152拄ᐼ\u0000\uecd7斿ᐼ\u0000ﵬ橈ᐼ\u0000\uf662欣ᐼ\u0000﹐稬ᐼ\u0000\uf696竅ᐼ\u0000\ue3a4篸ᐼ\u0000", new Object[]{"c", "b", apri.class, aptj.class, aqvz.class, aumq.class, avri.class, atvo.class, aozr.class, ausz.class, apmc.class, avev.class, aqul.class, atsr.class, auwf.class, aqwh.class, arbs.class, avnt.class, atlx.class, ardv.class, atjm.class});
            case NEW_MUTABLE_INSTANCE:
                return new auou();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (auou.class) {
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
