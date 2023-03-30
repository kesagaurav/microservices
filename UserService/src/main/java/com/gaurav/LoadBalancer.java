/*
 * package com.gaurav;
 * 
 * import org.springframework.cloud.client.DefaultServiceInstance; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Primary; import
 * org.springframework.stereotype.Component;
 * 
 * @Component public class LoadBalancer {
 * 
 * @Bean
 * 
 * @Primary ServiceInstanceListSupplier serviceInstanceListSupplier() { return
 * new DemoServiceInstanceListSuppler("RatingService"); } } class
 * DemoServiceInstanceListSuppler implements ServiceInstanceListSupplier {
 * private final String serviceId; DemoServiceInstanceListSuppler(String
 * serviceId) { this.serviceId = serviceId; }
 * 
 * @Override public Flux<List<ServiceInstance>> get() {
 * 
 * return Flux.just(Arrays.asList(new Default ServiceInstance(serviceId + "1",
 * serviceId, "localhost", 7400, false), new DefaultServiceInstance(serviceId +
 * "2", serviceId, "localhost", 7300, false))); }
 * 
 * @Override public String getServiceId() { return serviceId; } }
 */